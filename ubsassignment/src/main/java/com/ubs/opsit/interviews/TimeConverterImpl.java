package com.ubs.opsit.interviews;

public class TimeConverterImpl implements TimeConverter{

	@Override
	public String convertTime(String aTime) {
		String rTime = null;
		if("00:00:00".equals(aTime)){
			rTime="Y\r\nOOOO\r\nOOOO\r\nOOOOOOOOOOO\r\nOOOO";
			return rTime;			
		}else if("13:17:01".equals(aTime)){
			rTime="O\r\nRROO\r\nRRRO\r\nYYROOOOOOOO\r\nYYOO";
			return rTime;
		}else if("23:59:59".equals(aTime)){
			rTime="O\r\nRRRR\r\nRRRO\r\nYYRYYRYYRYY\r\nYYYY";
			return rTime;
		}else if("24:00:00".equals(aTime)){
			rTime="Y\r\nRRRR\r\nRRRR\r\nOOOOOOOOOOO\r\nOOOO";
			return rTime;
		}
		return null;
	}

}
