import java.util.Scanner;
public class physicsCalculator {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Welcome to the custom physics calculator based on Java, created by Anonymous");
        System.out.println();

        String op;
        double force1;
        double force2;
        double mass;
        double gravity;
        double force;
        double forcetotal;
        double weight_force;
        double elastic_force;
        double spring_constant;
        double moving_the_rest_position;
        double friction_force;
        double f_f_static;
        double f_f_dynamic;
        double pressing_force;
        double parallelogram_force;
        double mu_s;
        double mu_d;
        double height;
        double length;
        double balancing_force;
        double binding_forces;
        double base;

        // List of item of functions to calculate
        System.out.println("Please select with the lowercase character:");
        System.out.println("[a] to calculate the TOTAL FORCE");
        System.out.println("[b] to calculate the WEIGHT-FORCE");
        System.out.println("[c] to calculate the MASS");
        System.out.println("[d] to calculate the GRAVITY");
        System.out.println("[e] to calculate the ELASTIC FORCE");
        System.out.println("[f] to calculate the SPRING CONSTANT");
        System.out.println("[g] to calculate the MOVING THE REST POSITION");
        System.out.println("[h] to calculate the FRICTION FORCE Static");
        System.out.println("[i] to calculate the FRICTION FORCE Dynamic");
        System.out.println("[j] to calculate the PRESSING FORCE");
        System.out.println("[k] to calculate the PARALLELOGRAM FORCE");

        Scanner type = new Scanner(System.in);

        System.out.println("Select: ");
        op = type.next();

        switch (op){
            case "a":
                System.out.print("Enter the value of FORCE 1: ");
                force1 = type.nextDouble();
                System.out.print("Enter the value of FORCE 2: ");
                force2 = type.nextDouble();
                forcetotal = force1 + force2;
                System.out.print("Your value of TOTAL FORCE is "+forcetotal+" N\n");
                break;

            case "b":
                System.out.print("Enter the value of Mass: ");
                mass = type.nextDouble();
                System.out.print("Enter the value of Gravity: ");
                gravity = type.nextDouble();
                weight_force = mass * gravity;
                System.out.print("The value of Weight force "+weight_force+" N");
                break;

            case  "c":
                System.out.print("Enter the value of Weight-force: ");
                weight_force = type.nextDouble();
                System.out.print("Enter the value of Gravity: ");
                gravity = type.nextDouble();
                mass = weight_force/gravity;
                System.out.print("The value of Mass is "+mass+" kg");
                break;

            case "d":
                System.out.print("Enter the value of Weight-force: ");
                weight_force = type.nextDouble();
                System.out.print("Enter the value of Mass: ");
                mass = type.nextDouble();
                gravity = weight_force/mass;
                System.out.print("The value of Gravity is "+gravity+" N/kg");
                break;

            case "e":
                System.out.print("Enter the value of Spring Constant: ");
                spring_constant = type.nextDouble();
                System.out.print("Enter the value of Moving the rest position: ");
                moving_the_rest_position = type.nextDouble();
                elastic_force=spring_constant*moving_the_rest_position;
                System.out.print("The value of Elastic Force is "+elastic_force+" N");
                break;

            case  "f":
                System.out.print("Enter the value of Elastic force: ");
                elastic_force = type.nextDouble();
                System.out.print("Enter the value of Moving the rest position: ");
                moving_the_rest_position=type.nextDouble();
                spring_constant= elastic_force/moving_the_rest_position;
                System.out.print("The value of Spring Constant is "+spring_constant+" N/m");
                break;

            case "g":
                System.out.print("Enter the value of Elastic force: ");
                elastic_force = type.nextDouble();
                System.out.print("Enter the value of Spring Constant: ");
                spring_constant=type.nextDouble();
                moving_the_rest_position=elastic_force/spring_constant;
                System.out.print("The value of Moving the rest position is "+moving_the_rest_position+" m");
                break;

            case "h":
                System.out.print("Enter the value of Mu Static: ");
                mu_s=type.nextDouble();
                System.out.print("Enter the value of Pressing Force ");
                pressing_force=type.nextDouble();
                f_f_static = mu_s * pressing_force;
                System.out.print("The value of Friction Force Static is "+f_f_static+" N");
                break;

            case "i":
                System.out.print("Enter the value of Mu Dynamic: ");
                mu_d = type.nextDouble();
                System.out.print("Enter the value of Pressing Force: ");
                pressing_force=type.nextDouble();
                f_f_dynamic = mu_d * pressing_force;
                System.out.print("The value of Friction Force Dynamic is "+f_f_dynamic+" N");
                break;

            case "j":
                System.out.print("Enter the value of Weight-force:");
                weight_force = type.nextDouble();
                System.out.print("Enter the value of Parallal Force: ");
                parallelogram_force = type.nextDouble();
                pressing_force = Math.sqrt(Math.pow(weight_force,2)-Math.pow(parallelogram_force, 2));
                System.out.print("The value of Pressing Force is "+pressing_force+" N");
                break;

            case "k":
                System.out.print("Enter the value of Weight force: ");
                weight_force = type.nextDouble();
                System.out.print("Enter the value of Height: ");
                height = type.nextDouble();
                System.out.print("Enter the value of Length: ");
                length = type.nextDouble();
                parallelogram_force=weight_force*height/length;
                System.out.print("The value of Parallel force is "+parallelogram_force+" N");
                break;
            default:
                System.out.print("Please check you data, maybe there have some error or any incorrect information");


        }

    }
}
