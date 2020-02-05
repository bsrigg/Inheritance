class Human extends Mammal {

    public void goToWork() {
        System.out.println("I'm going to work, something only humans can do.");
    }
    // startSleeping method overrides method inherited from Mammal class 
    public void startSleeping() {
        System.out.println("Toss and turn");
        // super keyword will run method from superclass - the class where it is inherited from
        // in this case it will now run the Mammal.startSleeping() as part of the Human.startSleeping()
        super.startSleeping();
    }
}
