//CrudRepositoryTestRunner.java
package com.nt.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.nt.entity.FlightDetails;
import com.nt.service.IFlightMgmtService;

@Component
public class PAndSRepositoryTestRunner implements CommandLineRunner {
	@Autowired
	private IFlightMgmtService  flightService;

	@Override
	public void run(String... args) throws Exception {
		
		/*	try {
				Iterable<FlightDetails>  it=flightService.showFlightsAsSorted(false,"capacity");
				it.forEach(System.out::println);
			}
			catch(Exception e) {
			   e.printStackTrace();	
			}*/
		
		/*try {
			 Page<FlightDetails>  page=flightService.showFlightsByPageNo(4, 3);
			 System.out.println("Requested page records are ::");
			 page.forEach(System.out::println);
			 System.out.println("Current page number ::"+(page.getNumber()+1));
			 System.out.println("Total no.of pages ::"+page.getTotalPages());
			 System.out.println("no.of records in current page::"+page.getNumberOfElements());
			 System.out.println("Is the current is first page ?"+page.isFirst());
			 System.out.println("Is the current is last page ?"+page.isLast());
			 System.out.println("Is the current has next page ?"+page.hasNext());
			 System.out.println("Is the current has previous page ?"+page.hasPrevious());
		}
		catch(Exception e) {
			e.printStackTrace();
		}*/
		
		/*	try {
				 Page<FlightDetails>  page=flightService.showFlightsByPageNoAsSorted(1, 3,true,"capacity");
				 System.out.println("Requested page records are ::");
				 page.forEach(System.out::println);
				 System.out.println("-------------------------------------------");
				 System.out.println("Current page number ::"+(page.getNumber()+1));
				 System.out.println("Total no.of pages ::"+page.getTotalPages());
				 System.out.println("no.of records in current page::"+page.getNumberOfElements());
				 System.out.println("Is the current is first page ?"+page.isFirst());
				 System.out.println("Is the current is last page ?"+page.isLast());
				 System.out.println("Is the current has next page ?"+page.hasNext());
				 System.out.println("Is the current has previous page ?"+page.hasPrevious());
		
			}
			catch(Exception e) {
				e.printStackTrace();
			}*/
		
		try {
			flightService.showFlightsByPagination(2);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}//main
}//class
