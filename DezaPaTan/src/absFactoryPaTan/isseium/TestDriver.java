package absFactoryPaTan.isseium;

public class TestDriver {

	/*
	 * �܂���J�[�g
	 * ver.0.2 
	 * 
	 * �ύX�_
	 * �����Y�̃R�[�h���Q�l�Ɋȗ���
	 * 1. �����I�Ɏg����悤��CarPartsFactory�N���X���Ƀt�@�N�g�����\�b�h(Simple Factory)������� 
	 * 			=> final �ɂ��Ă邯�ǁA�q�N���X�i�H��j���H������Ă��܂����E�ɂȂ��Ă��܂��̂ŁA���郁�\�b�h���p�����珜�O������ď������ł����ł����H 
	 * 2. CarPartsFactory �� interface ���� abstract �ɕύX���A�f�t�H���g�̃G���W���ƃu���[�L���`���� 
	 */
	public static void main(String[] args) {
		// Init
		CarPartsFactory cpfactory;
		Car car;
		
		// Red
		System.out.println("--- Red ---");
		cpfactory  = CarPartsFactory.createFactory(CarPartsFactory.RED); // <--- RedParts
		car = new Car();
		car.setPartsFactory(cpfactory);
		car.startEngine();
		car.brake();
		
		// Blue
		System.out.println("--- Blue ---");
		cpfactory  = CarPartsFactory.createFactory(CarPartsFactory.BLUE); // <--- BlueParts (�ق��͕ω��Ȃ�
		car = new Car();
		car.setPartsFactory(cpfactory);
		
		car.startEngine();
		car.brake();
		
		// Yellow
		System.out.println("--- Yellow ---");
		cpfactory  = CarPartsFactory.createFactory(CarPartsFactory.YELLOW); // <--- YellowParts (�ق��͕ω��Ȃ�
		car = new Car();
		car.setPartsFactory(cpfactory);
		
		car.startEngine();
		car.brake();
	}
}
