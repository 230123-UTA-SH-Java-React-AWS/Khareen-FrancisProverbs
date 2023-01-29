package com.revature;

public class Pokemon {

  private int level;

  public Pokemon() {
    level = 1;
  }

  //Setters
  //level cannot be less than or equal 0
  //adding throws keyword next to the method signature will ignore any exception within the method

  {
    if (level > 0) {
      this.level = level;
    } else {
      //if someone uses this set method wrongfully, give exception
      throw new Exception("You set level to less than 0");
    }
  }
}
