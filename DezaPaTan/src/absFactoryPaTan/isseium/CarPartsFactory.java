package absFactoryPaTan.isseium;

/*
 * interface ���� abstract �ɕύX
 * NormalEngine, NormalBrake ���f�t�H���g�Ŏ���
 * �p�[�c�t�@�N�g���𐶐�����
 */
public abstract class CarPartsFactory {
	public static final int RED = 1;
	public static final int BLUE = 2;
	public static final int YELLOW = 4;
	
	public Engine createEngine(){
		return new NormalEngine();	
	}
	
	public Brake createBrake(){
		return new NormalBrake();
	}
	
	// �ǉ�
	// �t�@�N�g�����\�b�h
	// �I�[�o���C�h�͋֎~
	public static final CarPartsFactory createFactory(int type){
		CarPartsFactory retPf = null;
		
		switch(type){
		case RED:
			retPf = new RedPartsFactory();
			break;
		case BLUE:
			retPf = new BluePartsFactory();
			break;
		case YELLOW:
			retPf = new YellowPartsFactory();
			break;
		}
		
		return retPf;
	}
}
