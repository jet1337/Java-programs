// Feel free to add here any import statements that you need



/** TOTAL = 5 points
   This class models a basic subscription to a service.
   This version does not handle paid services, a subclass will
   do that for us.
   The code below compiles but is missing critical parts that you need to write. 
   Look for the TASK tags to tell you what you need to write.

**/
public class Subscription {
   
   /* TASK #1 - 1 point (.5 per attribute)
      Define the following private attributes;
      serviceName       of data type   String
      description       of data type   String
   */
   private String serviceName;
   private String description;


   /* TASK #2 - 1 point
      Provide the code for the following 2-args constructor so that it
      initialize the attributes appropriately. Do not modify the name
      of the parameters.      
   */
   public Subscription(String serviceName, String description){
      this.serviceName = serviceName;
      this.description = description;
   }
   


   /* TASK #3 - 1 point
      Provide the code for the following 1-arg constructor so that it
      calls the 2-args constructor from this class with an empty string
      as argument for the description parameter.
   */
   public Subscription(String serviceName){
      this(serviceName, "");
   }


   /* TASK #4 - 1 point
      Provide the code for the following 0-arg constructor so that it
      uses the 2-args constructor from this class to set the description to "Not Much"
      and the serviceName to "Nothing"
   */
   public Subscription(){
      this("Nothing", "Not Much");
   }
   
   
   
   /* TASK #5 - 1 point
      Provide the code for the following toString method so that it
      returns a String descriping this object in the following format:
      
      "Subscription to Libre Office (Open source microsoft replacement)"
      
      In the above example, the service name is "Libre Office"
      and the description is "Open source microsoft replacement"
   */
   public String toString(){
      return this.serviceName + " (" + this.description + ")";
   }

}//end class
