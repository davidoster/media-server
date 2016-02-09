package com.kaltura.media.quality.comparators.imagemagik;

import com.kaltura.media.quality.comparators.BaseSegmentsComparator;
import com.kaltura.media.quality.comparators.ImageComparator;
import com.kaltura.media.quality.configurations.SegmentsComparatorConfig;

public class ImageMagikSegmentsComparator extends BaseSegmentsComparator {
	
	public ImageMagikSegmentsComparator(SegmentsComparatorConfig comparatorConfig) {
		super(comparatorConfig);
	}

	@Override
	protected ImageComparator getImageComparator(String diffPath)
	{
		return new ImageMagikImageComparator(diffPath);
	}
}
