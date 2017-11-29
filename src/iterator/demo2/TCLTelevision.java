package iterator.demo2;

public class TCLTelevision implements Television {
	private Object[] obj = {"��������","��������","�Ϻ�����","��������","����������"};
	
	
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
