public class ZombiePlant {

    private int maximumPotency = 0;
    private int neededTreatments = 0;


    public ZombiePlant (int maximum, int treatments) {

        maximumPotency = maximum;
        neededTreatments = treatments;

        }

        public int getPotencyRequired() {
            return maximumPotency;

        }

        public int treatmentsNeeded () {
            return neededTreatments;
        }

        public boolean isDangerous() {
            return neededTreatments > 0;

            }

        public void treat(int potency) {
        if (potency > 0) {
            if(potency > maximumPotency)
            {
                neededTreatments++;
            }
            else if (neededTreatments > 0)
            {
                neededTreatments--;
            }

        }

    }


}
