public interface IScan { //we created an interface called IScan

    public abstract String scan(); //public abstract are not required because these are implied with interfaces
    //any class that implements IScan MUST have a method called scan() that returns a String

    }
