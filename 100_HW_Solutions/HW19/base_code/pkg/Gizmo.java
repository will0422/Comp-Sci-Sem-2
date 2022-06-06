package pkg;

public class Gizmo{

   public boolean isElectronic;
   public double price;
   public String maker;
   
   

   public Gizmo(String m_maker, boolean m_isElectronic, double m_price){
      maker = m_maker;
      isElectronic = m_isElectronic;
      price = m_price;
   }
   public Gizmo(String m_maker, boolean m_isElectronic){
      maker = m_maker;
      isElectronic = m_isElectronic;
   }
   public String getMaker(){
      return maker;
   }
   
   public boolean isElectronic(){
      return isElectronic;
   }
   public double getPrice(){
      return price;
   }
   

   public boolean equals(Gizmo a){

      if(a.getMaker().equals(maker) && a.isElectronic() == isElectronic && a.getPrice() == price){
         return true;
      }
      else{
         return false;
      }   
   }
   
   public String toString(){
   	return "" + maker + " " + isElectronic + " " + price;
   }

}