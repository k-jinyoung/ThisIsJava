package 연습문제.practice03;

public class Dog extends Pet{
	
	private String breed;			// 품종
    private boolean boosterShot;	// 예방주사 접종여부

    // 개의 이름, 나이와 품종을 각각 기본 값으로 초기화하고
    // 예방주사 접종여부는 false로 초기화하면서 Dog 객체를 생성한다
    public Dog(){
    	super();
		this.breed = "";
		this.boosterShot = false;
    }

    // 개의 이름, 나이, 품종을 각각 주어진 값으로 초기화하고
    // 예방주사 접종여부는 false로 초기화하면서 Dog 객체를 생성한다
    public Dog(String name, int age, String breed){
        super(name, age);
        this.breed = breed;
        this.boosterShot = false;
    }
    
    public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public boolean isBoosterShot() {
		return boosterShot;
	}

	public void setBoosterShot(boolean boosterShot) {
		this.boosterShot = boosterShot;
	}
    

    // 개의 모든 데이터를 알려 준다
	public String toString(){
      return super.toString()+ ", 품종: " + breed + ", 예방주사 여부: " + boosterShot;
	}
}

    
