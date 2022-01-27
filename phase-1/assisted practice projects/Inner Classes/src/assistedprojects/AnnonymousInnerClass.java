package assistedprojects;

abstract class AnonymousInnerClass1 {
	   public abstract void display();
	}


	public class AnnonymousInnerClass {
		public static void main(String[] args) {
			AnonymousInnerClass1 i = new AnonymousInnerClass1() {

			         public void display() {
			            System.out.println("Anonymous Inner Class");
			         }
			      };
			      i.display();
			   }
			}

	


	