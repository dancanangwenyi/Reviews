/**
	 * D/HD
	 * @return an array of character names, in order of highest to lowest average ratings
	 */
	public String[] mostToLeastFavorite() {

		int arr [][] = ratings;
		String chak [] = new String[arr.length];
		for (int j=0; j<arr.length;j++) {
			double highest=0;
			int index = 0;
			for (int i=0;i<arr.length;i++) {
				int []rating = arr[i];
				double sum=0,average=0;
				for(int x: rating){
					sum+=x;
				}
				average = sum/ arr.length;
				if(average > highest){
					highest =average;
					index = i;
				}
			}
			arr[index] = new int[0];
			chak[j] = characters[index];
		}

		return chak;

	}
