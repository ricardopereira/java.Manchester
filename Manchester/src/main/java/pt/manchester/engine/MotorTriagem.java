package pt.manchester.engine;

import java.util.List;

import org.drools.KnowledgeBase;
import org.drools.KnowledgeBaseFactory;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderError;
import org.drools.builder.KnowledgeBuilderErrors;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.io.ResourceFactory;
import org.drools.logger.KnowledgeRuntimeLogger;
import org.drools.logger.KnowledgeRuntimeLoggerFactory;
import org.drools.runtime.StatefulKnowledgeSession;

import pt.manchester.logic.Areas.*;

public class MotorTriagem {
	private List<Area> areas;
	private KnowledgeBase kbase;
	private StatefulKnowledgeSession ksession;
	
	public MotorTriagem() {
		this.areas = null;
	}
	
	public void prepare(List<Area> areas) {
		reset();
		if (areas == null) return;
		if (areas.isEmpty()) return;
		
		this.areas = areas;
		
        try {
        	loadKnowledgeBase();
        	
            ksession = kbase.newStatefulKnowledgeSession();
            
            // Memória de trabalho inicial
            for (Area item : areas)
            	ksession.insert(item);
        }
        catch (Throwable t) {
            t.printStackTrace();
        }
	}
	
	public void reset() {
		clearKnowledgeBase();
		ksession = null;
	}
	
	public void start() {
		if (ksession != null)
			ksession.fireAllRules();
	}
	
	protected void loadKnowledgeBase() throws Exception {
		if (areas == null) return;
		if (areas.isEmpty()) return;
		
        KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
        
        // Regras globais
        kbuilder.add(ResourceFactory.newClassPathResource("Global.drl"), ResourceType.DRL);
        
        // Regras de cada área
        for (Area item : areas)
        	kbuilder.add(ResourceFactory.newClassPathResource(item.getRulesFile()), ResourceType.DRL);
        
        KnowledgeBuilderErrors errors = kbuilder.getErrors();
        if (errors.size() > 0) {
            for (KnowledgeBuilderError error: errors) {
                System.err.println(error);
            }
            throw new IllegalArgumentException("Could not parse knowledge.");
        }
        kbase = KnowledgeBaseFactory.newKnowledgeBase();
        kbase.addKnowledgePackages(kbuilder.getKnowledgePackages());
	}
	
	protected void clearKnowledgeBase() {
		kbase = null;
	}
	
}
