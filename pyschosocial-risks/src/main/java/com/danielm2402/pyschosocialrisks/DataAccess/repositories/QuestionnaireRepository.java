package com.danielm2402.pyschosocialrisks.DataAccess.repositories;
import com.danielm2402.pyschosocialrisks.DataAccess.models.*;
import com.github.javafaker.Faker;
import org.springframework.stereotype.Repository;


import java.util.ArrayList;
import java.util.Date;

@Repository
public class QuestionnaireRepository {
    private ArrayList<PsychologicalSupportProcess> psp;

    public QuestionnaireRepository(){
        this.psp =  new ArrayList<PsychologicalSupportProcess>();
        uploadPSPs();
    }

    public PsychologicalSupportProcess savePSP(PsychologicalSupportProcess psp){
        System.out.println("CREANDOOO" + psp.getId());
        if(this.psp.add(psp)){
            return psp;
        }
        return null;
    }
    public ArrayList<PsychologicalSupportProcess> findAll(){
        return this.psp;
    }

    public PsychologicalSupportProcess findById (String id){
        for (PsychologicalSupportProcess psp: this.psp){
            if (psp.getId().equals(id)){
                return psp;
            }
        }
        return null;
    }

    public PsychologicalSupportProcess updatePSP (String id, PsychologicalSupportProcess psp){
        for (int i=0; i < this.psp.size();i++){
            if (this.psp.get(i).getId().equals(id)){
                this.psp.set(i, psp);
                return psp;
            }
        }
        return null;
    }

    public boolean deletePSP (String id){
        for (int i=0; i < this.psp.size();i++){
            if (this.psp.get(i).getId().equals(id)){
                this.psp.remove(i);
                return true;
            }
        }
        return false;
    }

    private void uploadPSPs(){
        AbstractQuestionnaire PsyFactorsIntra = CreatePsyFactorsIntra();
        AbstractQuestionnaire CreatePsyFactorsExtra = CreatePsyFactorsExtra();

        ArrayList<AbstractQuestionnaire> questionnaires = new ArrayList<AbstractQuestionnaire>();
        questionnaires.add(PsyFactorsIntra);
        questionnaires.add(CreatePsyFactorsExtra);

        Faker faker = Faker.instance();

        User u1 = new User(faker.idNumber().valid(),faker.name().fullName(), faker.country().capital(),faker.demographic().maritalStatus(), faker.job().position());
        User u2 = new User(faker.idNumber().valid(),faker.name().fullName(), faker.country().capital(),faker.demographic().maritalStatus(), faker.job().position());
        User u3 = new User(faker.idNumber().valid(),faker.name().fullName(), faker.country().capital(),faker.demographic().maritalStatus(), faker.job().position());
        User u4 = new User(faker.idNumber().valid(),faker.name().fullName(), faker.country().capital(),faker.demographic().maritalStatus(), faker.job().position());
        User u5 = new User(faker.idNumber().valid(),faker.name().fullName(), faker.country().capital(),faker.demographic().maritalStatus(), faker.job().position());

        PsychologicalSupportProcess psp1 = new PsychologicalSupportProcess("psp1","Proceso de Apoyo Gestión de la Seguridad y Salud en el Trabajo" ,new Date(), u1,questionnaires);
        PsychologicalSupportProcess psp2 = new PsychologicalSupportProcess("psp2","Proceso de Apoyo Gestión de la Seguridad y Salud en el Trabajo" ,new Date(), u2,questionnaires);
        PsychologicalSupportProcess psp3 = new PsychologicalSupportProcess("psp3","Proceso de Apoyo Gestión de la Seguridad y Salud en el Trabajo" ,new Date(), u3,questionnaires);
        PsychologicalSupportProcess psp4 = new PsychologicalSupportProcess("psp4","Proceso de Apoyo Gestión de la Seguridad y Salud en el Trabajo" ,new Date(), u4,questionnaires);
        PsychologicalSupportProcess psp5 = new PsychologicalSupportProcess("psp5","Proceso de Apoyo Gestión de la Seguridad y Salud en el Trabajo" ,new Date(), u5,questionnaires);

        this.psp.add(psp1);
        this.psp.add(psp2);
        this.psp.add(psp3);
        this.psp.add(psp4);
        this.psp.add(psp5);
    }


    private AbstractQuestionnaire CreatePsyFactorsIntra(){
        ArrayList<String> answers = new ArrayList<String>();
        answers.add("Siempre");
        answers.add("Casi siempre");
        answers.add("Algunas veces");
        answers.add("Casi nunca");
        answers.add("Nunca");

        AQuestion question1 = new Question("El ruido en el lugar donde trabaja es molesto",answers,"");
        AQuestion question2 = new Question("En el lugar donde trabaja hace mucho frio",answers,"");
        AQuestion question3 = new Question("En el lugar donde trabaja hace mucho calor",answers,"");
        AQuestion question4 = new Question("El aire en el lugar es fresco y agradable",answers,"");
        AQuestion question5 = new Question("La luz del sitio donde trabajo es agradable",answers,"");
        AQuestion question6 = new Question("El espacio donde trabajo es comodo",answers,"");
        AQuestion question7 = new Question("En mi trabajo me preocupa estar expuesto a sustancias quimicas que afecten mi salud",answers,"");

        ArrayList<AQuestion> questions = new ArrayList<AQuestion>();
        questions.add(question1);
        questions.add(question2);
        questions.add(question3);
        questions.add(question4);
        questions.add(question5);
        questions.add(question6);
        questions.add(question7);

        AbstractQuestionnaire psyFactorsIntra = new PsyFactorsIntra("FACTORES PSICOSOCIALES INTRALABORAL", questions);

        return psyFactorsIntra;
    }

    private AbstractQuestionnaire CreatePsyFactorsExtra(){
        ArrayList<String> answers = new ArrayList<String>();
        answers.add("Siempre");
        answers.add("Casi siempre");
        answers.add("Algunas veces");
        answers.add("Casi nunca");
        answers.add("Nunca");

        AQuestion question1 = new Question("Es fácil trasportarme entre mi casa y el trabajo",answers,"");
        AQuestion question2 = new Question("Tengo que tomar varios medios de transporte para llegar a mi lugar de trabajo",answers,"");
        AQuestion question3 = new Question("Paso mucho tiempo viajando de ida y regreso al trabajo",answers,"");
        AQuestion question4 = new Question("Me transporto cómodamente entre mi casa y el trabajo",answers,"");
        AQuestion question5 = new Question("La zona donde vivo es segura",answers,"");
        AQuestion question6 = new Question("En la zona donde vivo se presentan hurtos y mucha delincuencia",answers,"");
        AQuestion question7 = new Question("Desde donde vivo me es fácil llegar al centro médico donde me atienden",answers,"");

        ArrayList<AQuestion> questions = new ArrayList<AQuestion>();
        questions.add(question1);
        questions.add(question2);
        questions.add(question3);
        questions.add(question4);
        questions.add(question5);
        questions.add(question6);
        questions.add(question7);

        AbstractQuestionnaire psyFactorsExtra = new PsyFactorsExtra("FACTORES PSICOSOCIALES EXTRALABORALES", questions);

        return psyFactorsExtra;
    }


}
