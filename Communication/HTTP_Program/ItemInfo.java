record ItemInfo(double price, int stock) {
	
	//info ===> price:4000,stock:30
	public static ItemInfo parseItemInfo(String info) {
		String[] parts = info.split(",");
		double price = Double.parseDouble(parts[0].substring(6));
		int stock = Integer.parseInt(parts[1].substring(6));
		return new ItemInfo(price, stock);
	}
}

