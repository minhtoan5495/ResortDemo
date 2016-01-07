package demo;

public abstract class Accommodation {
		private String name;
		public Accommodation() {
		}
		public Accommodation(String name, float price) {
			this.name = name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getName() {
			return name;
		}
		@Override
		public String toString() {
			return name;
		}
		public abstract float getPrice();
}