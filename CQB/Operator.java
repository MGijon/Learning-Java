public class Operator{
  /* Constructor
     =========== */
  public Operator(String name, int team, int life, double consistency, double speed){
    this.name = name;
    this.team = team;
    this.life = life; /* 0-100 */
    this.consistency = consistency; /* probabilidad de acierto 0-1 */
    this.speed = speed; /* velocidad 0-1 */
  }

  /* Atributtes
    =========== */
  public double vision_angle = 120;

  /* Methods
     ======= */
     /* Setters and getters */
  public double getConsistency(){
    return this.consistency;
  }
  private void setConsistency(double x){
    this.consistency = x;
  }
  public double getSpeed(){
    return this.speed;
  }
  private void setSpeed(double x){
    this.speed = x;
  }
  public int getLife(){
    return this.life;
  }
  public void setLife(int x){
    this.life = x;
  }
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
