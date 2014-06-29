package main.java.by.bsuir.course3.yapis.graphLangTranslator.model.types;

import main.java.by.bsuir.course3.yapis.graphLangTranslator.model.types.exception.UndefinedOperationException;

public abstract class TypeUndefinedOperationsAdapter<ReturnType, ContentType> implements Type<ReturnType, ContentType>{

	@Override
	public ReturnType operatorPlus(ReturnType secondOperand)
			throws UndefinedOperationException {
		throw new UndefinedOperationException();
	}

	@Override
	public ReturnType operatorMinus(ReturnType secondOperand)
			throws UndefinedOperationException {
		throw new UndefinedOperationException();
	}

	@Override
	public ReturnType operatorDevision(ReturnType secondOperand)
			throws UndefinedOperationException {
		throw new UndefinedOperationException();
	}

	@Override
	public ReturnType operatorMultiplication(ReturnType secondOperand)
			throws UndefinedOperationException {
		throw new UndefinedOperationException();
	}

	@Override
	public TypeBoolean operatorLessOrEqual(ReturnType secondOperand)
			throws UndefinedOperationException {
		throw new UndefinedOperationException();
	}

	@Override
	public TypeBoolean operatorLess(ReturnType secondOperand)
			throws UndefinedOperationException {
		throw new UndefinedOperationException();
	}

	@Override
	public TypeBoolean operatorGreaterOrEqual(ReturnType secondOperand)
			throws UndefinedOperationException {
		throw new UndefinedOperationException();
	}

	@Override
	public TypeBoolean operatorGreater(ReturnType secondOperand)
			throws UndefinedOperationException {
		throw new UndefinedOperationException();
	}

	@Override
	public TypeBoolean operatorEqual(ReturnType secondOperand)
			throws UndefinedOperationException {
		throw new UndefinedOperationException();
	}

	@Override
	public TypeBoolean operatorNotEqual(ReturnType secondOperand)
			throws UndefinedOperationException {
		throw new UndefinedOperationException();
	}

	
	
}
