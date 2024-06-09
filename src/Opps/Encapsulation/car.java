package Opps.Encapsulation;

public class car {
    private String model;
    private String company;
    private int year;
    car(String model,String company,int year){
        this.model=model;
        this.setCompany(company);
        this.year=year;
    }
    car(String model,String company){
        this.model=model;
        this.setCompany(company);

    }


    car(String model){
        this.model=model;

    }
    public String getModel(){
        return model;
    }
    public String getCompany(){
        return company;
    }
    public int getYear(){
        return year;
    }




    public void setModel(String model){
        this.model=model;
    }
    public void setCompany(String company){ this.company=company;}

}
