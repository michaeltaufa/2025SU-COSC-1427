/*
Program: Class Monster Card
Description: 
  This class will be focused on Monster Cards in YuGiOh.
  The following attributes below are focused:
    - Monster Name
    - Monster Level
    - Attack Level
    - Defense Level

  Method:
  - Display Monster Name
  - Display Monster Level
  - Display Attack Level
  - Display Defense Level
  - Monster Card has been summoned
  - Monster Card is in attack position 
  - Monster Card is in defense position

Created By: Michael Hikuleomtaufa
Date: 2025-08-23
*/

public class YuGiOh_MonsterCard {

  // Attributes:
  private String monsterName;
  private int monsterLevel;
  private int attackLevel;
  private int defenseLevel;
  private String monsterDescription;

  // Constructor:
  public YuGiOh_MonsterCard (String monsterName, int monsterLevel, int attackLevel, int defenseLevel, String monsterDescription){
    this.monsterName = monsterName;
    this.monsterLevel = monsterLevel;
    this.attackLevel = attackLevel;
    this.defenseLevel = defenseLevel;
    this.monsterDescription = monsterDescription;
  }

  // Methods:
  public void displayMonsterName(){
    System.out.println("This card is called '" + monsterName + "'.");
  }

  public void displayMonsterLevel(){
    System.out.println(monsterName + "'s level is " + monsterLevel + " stars.");
  }
  
  public void displayAttackLevel(){
    System.out.println(monsterName + "'s attack level is " + attackLevel);
  }

  public void displayDefenseLevel(){
    System.out.println(monsterName + "'s defense level is " + defenseLevel);
  }

  public void displayMonsterDescription(){
    System.out.println("Description: " + monsterDescription);
  }

  public void summonMonsterCard(){
    System.out.println(monsterName + " has been summoned.");
  }

  public void setToAttackPosition(){
    System.out.println(monsterName + " has been set to attack position.");
  }

  public void setToDefensePosition(){
    System.out.println(monsterName + " has been set to defense position.");
  }

  public static void main(String[] args) {
  }
}
