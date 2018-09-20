package org.demo;

import org.demo.model.Report;
import org.springframework.batch.item.ItemProcessor;


public class CustomItemProcessor implements ItemProcessor<Report, Report> {

	@Override
	public Report process(Report item) throws Exception {
		
		System.out.println("Processing..." + item);
		return item;
	}

}