class Student extends Person{
	

	private int[] testScores;

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
	public Student(String firstName, String lastName, int identification, int[] testScore) {
		super(firstName, lastName, identification);
		this.testScores = testScore;		
	}
	
	
    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
	public String calculate(){
		int sum = 0, average;
//		System.out.println(testScores[0]);
//		System.out.println(testScores[1]);
		for(int i = 0; i < testScores.length; i++){
			sum += testScores[i];
//			System.out.println(testScores[i]);
		}
//		System.out.println(testScores.length);
//		System.out.println(sum);
		average = sum / testScores.length;
//		System.out.println(average);
		
		if( average < 40){
			return "T";
		}else if( average >= 40 && average < 55 ){
			return "D";
		}else if( average >= 55 && average < 70 ){
			return "P";
		}else if( average >= 70 && average < 80 ){
			return "A";
		}else if( average >= 80 && average < 90 ){
			return "E";
		}else if( average >= 90 && average <= 100 ){
			return "O";
		}else{
			return "error";
		}
		
	}
}
