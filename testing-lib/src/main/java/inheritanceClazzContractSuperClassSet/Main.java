package inheritanceClazzContractSuperClassSet;

import testing_lib.inheritanceClazzContractSuperClassSet.Clazz1;
import testing_lib.inheritanceClazzContractSuperClassSet.Clazz2;
import testing_lib.inheritanceClazzContractSuperClassSet.InheritanceClazzContractSuperInterfaceSet;

public class Main {

	public static void main(String[] args) {
		Clazz1 constr = (Clazz2) new InheritanceClazzContractSuperInterfaceSet();
	}
	
}
