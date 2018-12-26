public class Operator{
  /* Constructor
     =========== */
  public Operator(String name, int team){
    this.name = name;
    this.team = team;
  }

  /* Atributtes
    =========== */
  public double vision_angle = 120;

  /* Methods
     ======= */
     /* Setters and getters */
  protected String getName(){
    return this.name;
  }
  private void setName(String x){
    this.name = x;
  }
  protected int getTeam(){
    return this.team;
  }
  private void setTeam(int x){
    this.team = x;
  }
  public double getVision_angle(){
    /* return the atributte vision_angle */
    return this.vision_angle;
  }
  public void setVision_angle(double x){
    /* set value for the parametter vision_angle */
    this.vision_angle = x;
  }
    /* Internal calculations */
}
