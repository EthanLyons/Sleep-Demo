package edu.cnm.deepdive;


public class MultipleThread {

  public static void main(String[] args) {
    LazyThread lazy = new LazyThread();
    lazy.start();
    Utility.processInput();

  }

}
