package CreationModel.builder_pattern.builder;


/**
* 具体建造者
*   Audi汽车
* @author Atom
* @version 1.0
* @date 2020/1/26 - 17:59
*/
public class AudiCarBuilderImpl extends CarBuilder {
   @Override
   public CarBuilder buildBrand() {
       car.setBand("Audi");
       return this;
   }

   @Override
   public CarBuilder buildTon() {
       car.setTon(2f);
       return this;
   }

   @Override
   public CarBuilder buildEmissions() {
       car.setEmissions(2.0f);
       return this;
   }
}
