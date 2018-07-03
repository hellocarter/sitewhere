/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package com.sitewhere.spi.asset;

import com.sitewhere.spi.common.IAccessible;
import com.sitewhere.spi.common.IImageProvider;
import com.sitewhere.spi.common.ISiteWhereEntity;

/**
 * Information about a class of assets with common information.
 * 
 * @author Derek
 */
public interface IAssetType extends ISiteWhereEntity, IAccessible, IImageProvider {

    /**
     * Get category of asset type.
     * 
     * @return
     */
    public AssetCategory getAssetCategory();
}