package edu.uconn.vstlf.block;

import edu.uconn.vstlf.data.doubleprecision.Series;
import edu.uconn.vstlf.prediction.DataFeed;

public class UpdateLoadSpec extends BlockSpec {

	private int lvl_;
	
	public UpdateLoadSpec(int lvl) {lvl_ = lvl; }
	
	@Override
	public
	InputBlock getInputBlock(DataFeed feed) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public
	OutputBlock getOutputBlock(DataFeed feed) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public
	UpdateBlock getUpdateBlock(DataFeed feed) throws Exception {
		// TODO Auto-generated method stub
		int nLvls = feed.getNDecompLvls();
		Series refOut = feed.getDecomposedLoads(0)[lvl_];
		Series lastMaxInput = feed.getDecomposedLoads(-1)[nLvls];
		return new UpdateLoadBlock(refOut, lastMaxInput, lvl_, nLvls);
	}

}
