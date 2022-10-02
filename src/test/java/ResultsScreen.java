public class ResultsScreen {
    double[] resultList;

    public double[] getResultList() {
        return resultList;
    }

    public void resultsScreen(double value, int inputSessions) {
        System.out.println(value);
        resultList[inputSessions]=value;
        //return resultList;
    }


}

