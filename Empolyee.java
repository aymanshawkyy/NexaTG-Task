public  class Empolyee {
   private String name;
   private int id ;
   private Team team ;

   public Empolyee(String name,int id){
       this.name = name ;
       this.id = id ;
   }

    public String getName(){
        return name;
    }

    public int getId(){
        return id ;
    }

    public void setname(){
        this.name =name  ;
    }

    public void setId(){
       this.id= id ;
    }

public Team getTeam(){
       return team ;
}
    public Team setTeam(Team team){
        return this.team = team;
    }


}
