package strategy_pattern_tmd;

public class StrategyPattern_MainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedList sortedList = new SortedList();
		sortedList.add("TMD");
		sortedList.add("VTA");
		sortedList.add("TDT");
		sortedList.add("LAT");
		sortedList.add("PMH");

		sortedList.setSortStrategy(new QuickSort());
		sortedList.sort();

		sortedList.setSortStrategy(new MergeSort());
		sortedList.sort();
	}

}
