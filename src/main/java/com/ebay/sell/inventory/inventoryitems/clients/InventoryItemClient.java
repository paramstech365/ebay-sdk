package com.ebay.sell.inventory.inventoryitems.clients;

import com.ebay.sell.inventory.inventoryitems.models.InventoryItem;
import com.ebay.sell.inventory.inventoryitems.models.InventoryItems;

public interface InventoryItemClient {

	public InventoryItem getInventoryItem(final String sku);

	public void updateInventoryItem(final InventoryItem inventoryItem);

	public void deleteInventoryItem(final String sku);

	public InventoryItems getInventoryItems(final int offset, final int limit);

}
