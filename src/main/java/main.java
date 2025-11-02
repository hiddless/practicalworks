public class main {
    public static void main(String[] args) {
        survivor s1 = new survivor();
        System.out.println("defalt: " + s1);
        survivor joel = new survivor("Joel", 90, 6);
        survivor ellie = new survivor("Ellie", 70, 12);
        System.out.println("Joel:  " + joel);
        System.out.println("Ellie: " + ellie);
        survivor copyOfEllie = new survivor(ellie);
        System.out.println("ellie copy: " + copyOfEllie);
        ellie.damage(25);
        joel.attack(2);
        joel.damage(5);

        System.out.println("after vs - Joel:  " + joel);
        System.out.println("after vs - Ellie: " + ellie);
        survivor better = survivor.betterState(joel, ellie);
        System.out.println("hwho is better: " + better.getName());
        System.out.println("ellie equals copyellie? " + ellie.equals(copyOfEllie));

    }


}
