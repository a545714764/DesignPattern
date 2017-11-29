package iterator.demo2;

public class TCLTelevision implements Television {
	private Object[] obj = {"湖南卫视","北京卫视","上海卫视","湖北卫视","黑龙江卫视"};
	
	
	@Override
	public TVIterator createIterator() {

		return new TCLworthIterator();
	}
	
	private class TCLworthIterator implements TVIterator{
		private int currentIndex = 0;
		@Override
		public void setChannel(int i) {
			currentIndex = i;
		}

		@Override
		public void next() {
			if(currentIndex<obj.length){
				currentIndex++;
			}
		}

		@Override
		public void previous() {
			if(currentIndex>0){
				currentIndex--;
			}
		}

		@Override
		public boolean isLast() {
			
			return currentIndex==obj.length;
		}

		@Override
		public Object currentChannel() {
			
			return obj[currentIndex];
		}

		@Override
		public boolean isFirst() {
			
			return currentIndex==0;
		}
		
	}

}
