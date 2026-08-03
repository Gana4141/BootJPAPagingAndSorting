package com.nt.service;

import org.springframework.data.domain.Page;

import com.nt.entity.FlightDetails;

public interface IFlightMgmtService {
   public  Iterable<FlightDetails>   showFlightsAsSorted(boolean ascOrder, String ...props);  
   public   Page<FlightDetails>  showFlightsByPageNo(int pageno,int pagesize);
   public   Page<FlightDetails>  showFlightsByPageNoAsSorted(int pageno,int pagesize,boolean ascOrder,String ...props);
   public   void   showFlightsByPagination(int pageSize);
   
}
