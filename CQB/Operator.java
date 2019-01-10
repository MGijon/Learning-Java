public class Operator{

  /* Atributtes
    =========== */
  public double vision_angle = 120;
  public String name;
  public int team;
  public int life;
  public double consistency;
  public double speed;

  /* Constructor
     =========== */
  public Operator(String name, int team, int life, double consistency, double speed, int position[]){
    this.name = name;
    this.team = team;
    this.life = life; /* 0-100 */
    this.consistency = consistency; /* probabilidad de acierto 0-1 */
    this.speed = speed; /* velocidad 0-1 */
    this.position = position; /* (x, y) */
  }

  /* Methods
     ======= */
     /* Setters and getters */
  public int[] getPosition(){
    return position[];
  }
  private void setPosition(int pos[]){
    this.position = pos;
  }
  public double getConsistency(){
    return consistency;
  }
  private void setConsistency(double x){
    this.consistency = x;
  }
  public double getSpeed(){
    return speed;
  }
  private void setSpeed(double x){
    this.speed = x;
  }
  public int getLife(){
    return life;
  }
  public void setLife(int x){
    this.life = x;
  }
  protected String getName(){
    return name;
  }
  private void setName(String x){
    this.name = x;
  }
  protected int getTeam(){
    return team;
  }
  private void setTeam(int x){
    this.team = x;
  }
  public double getVision_angle(){
    /* return the atributte vision_angle */
    return vision_angle;
  }
  public void setVision_angle(double x){
    /* set value for the parametter vision_angle */
    this.vision_angle = x;
  }

    /* Internal calculations */
  public void move(int x, int y){
    this.position[1] = x;
    this.position[2] = y;
  }
}
