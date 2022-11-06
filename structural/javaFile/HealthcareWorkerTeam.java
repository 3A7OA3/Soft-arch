package javaFile;

import java.util.ArrayList;
import java.util.List;

public class HealthcareWorkerTeam implements HealthcareServiceable {
	
	private List<HealthcareServiceable> list = new ArrayList<HealthcareServiceable>();
	@Override
	public void service() {
		// TODO Auto-generated method stub
		for(HealthcareServiceable l:list) {
			l.service();
		}
		
		
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		double price = 0;
		for(HealthcareServiceable l:list) {
			price += l.getPrice();
		}
		return price;
	}

	public void addMember(HealthcareServiceable member) {
		// TODO Auto-generated method stub
		list.add(member);
	}

	public void removeMember(HealthcareServiceable member) {
		// TODO Auto-generated method stub
		list.remove(member);
	}
	
	
	
}
