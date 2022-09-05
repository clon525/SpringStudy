package ru.javalang.item02setter;

public class SetterInjection {

	private Dependency dependency;

	public void setDependency(Dependency dependency) {
		this.dependency = dependency;
	}

	@Override
	public String toString() {
		return dependency.toString();
	}
}
