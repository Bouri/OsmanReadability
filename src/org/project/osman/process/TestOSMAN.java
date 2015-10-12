package org.project.osman.process;

import java.io.IOException;

public class TestOSMAN {

	public static void main(String[] args) throws InterruptedException, IOException{
		
		//create an instance of the OsmanReadability classs
		OsmanReadability osman = new OsmanReadability();
		
		//loading the Arabic dictionary - needed for tokenization and sentence splitting.
		osman.loadData();
		
		String text = "�������� ��������� ���������� ����� �������������";
		
		double osmanScore = osman.calculateOsman(text);
		System.out.println("Osman Score: " + osmanScore);
		
		
		String textNoTashkeel = "������ ����� ����� ���� �������";

		String textAddedTashkeel = osman.addTashkeel(textNoTashkeel);
		//String textAddedTashkeel = osman.addTashkeel(textNoTashkeel);
		System.out.println(textAddedTashkeel);
		double osmanScore2 = osman.calculateOsman(textAddedTashkeel);
		System.out.println("Osman Score: " + osmanScore2);
		
		String textWithTashkeel  = "�������� ��������� ���������� ����� �������������";
		String textTashkeelRemoved = osman.removeTashkeel(textWithTashkeel);
		System.out.println(textTashkeelRemoved);
		
		
	}
}
