class Solution {
    public String convertDateToBinary(String date) {
     
        // Split the date into year, month, and day  
        String[] parts = date.split("-");  
        int year = Integer.parseInt(parts[0]);  
        int month = Integer.parseInt(parts[1]);  
        int day = Integer.parseInt(parts[2]);  
        
        // Convert each part to binary without leading zeros  
        String binaryYear = Integer.toBinaryString(year);  
        String binaryMonth = Integer.toBinaryString(month);  
        String binaryDay = Integer.toBinaryString(day);  
        
        // Format the output as "year-month-day"  
        return binaryYear + "-" + binaryMonth + "-" + binaryDay;  
    }  


    
}
        
    
