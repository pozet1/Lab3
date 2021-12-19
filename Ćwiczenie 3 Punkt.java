public class Punkt {
      
        private int pX, pY, pZ;

        Punkt(int pX) {
            this.pX = pX;
        }

        Punkt(int pX, int pY, int pZ) {
            this.pX = pX;
            this.pY = pY;
            this.pZ = pZ;
        }

        public int getpZ()
        {
            return pZ * 10;
        }
        
        public int getpX()
        {
            return pX;
        }

        public int getpY()
        {
            return pY;
        }
        
        public void setpX(int pX)
        {
            this.pX = pX;
        }

        public void setpY(int pY)
        {
            this.pY = pY;
        }

        public void setpZ(int pZ)
        {
            this.pZ = pZ;
        }

        public int suma()
        {
            return pX + pY + getpZ();
        }

        public int roznica()
        {
            return pX - pY - getpZ();
        }

        public int roznica(int x, int y, int z)
        {
            return pX * x - pY * y - getpZ() * z;
        }
        @Override
        public String toString() 
        {
            return "Punkt = {" + "x = " + pX + ", y = " + pY + ", z = " + getpZ() + "}";
        }
}
