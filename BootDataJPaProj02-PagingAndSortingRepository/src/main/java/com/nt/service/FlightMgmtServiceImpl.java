package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.nt.entity.FlightDetails;
import com.nt.repository.IFlightDetailsRepository;

@Service
public class FlightMgmtServiceImpl implements IFlightMgmtService {

    @Autowired
	private  IFlightDetailsRepository  flightRepository;

	@Override
	public Iterable<FlightDetails> showFlightsAsSorted(boolean ascOrder, String... props) {
		//create the Sort object
		Sort sort=Sort.by(ascOrder?Sort.Direction.ASC:Sort.Direction.DESC, props);
		//  invoke the findAll(sort) method
		Iterable<FlightDetails>  it=flightRepository.findAll(sort);
		return it;
	}

	@Override
	public Page<FlightDetails> showFlightsByPageNo(int pageno, int pagesize) {
		//create Pageable object having inputs
		Pageable pageable=PageRequest.of(pageno, pagesize);
		//execute the code
		Page<FlightDetails>  page=flightRepository.findAll(pageable);
		return page;
	}
	
	@Override
	public Page<FlightDetails> showFlightsByPageNoAsSorted(int pageno, int pagesize,
			                                                                                                     boolean ascOrder,	String... props) {
		//create Sort object
		Sort sort=Sort.by(ascOrder?Sort.Direction.ASC:Sort.Direction.DESC, props);
		//create Pageable object having inputs
		Pageable pageable=PageRequest.of(pageno, pagesize,sort);
	   //invoke the method
		 Page<FlightDetails> page=flightRepository.findAll(pageable);
		return page;
	}
	
	@Override
	public void showFlightsByPagination(int pageSize) {
		// get total  records
		long count=flightRepository.count();
		
		//decide no.of pages
		long pagesCount=count/pageSize;
		if(count%pageSize!=0)
			pagesCount++;
		
		//  display  records  through pagination
		for(int i=0;i<pagesCount;++i) {
			//create Pageable object
			Pageable pageable=PageRequest.of(i, pageSize);
			//get each page 
			Page<FlightDetails>  page=flightRepository.findAll(pageable);
			System.out.println("records of page::  "+(page.getNumber()+1)+"/"+page.getTotalPages());
			page.forEach(System.out::println);
			System.out.println("----------------------------");
			System.out.println("===============================");
			System.out.println("--------------------------------");
		}
	 	
		
	}

    
	
}
