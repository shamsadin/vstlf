/************************************************************************
 MIT License

 Copyright (c) 2010 University of Connecticut

 Permission is hereby granted, free of charge, to any person obtaining
 a copy of this software and associated documentation files (the
 "Software"), to deal in the Software without restriction, including
 without limitation the rights to use, copy, modify, merge, publish,
 distribute, sublicense, and/or sell copies of the Software, and to
 permit persons to whom the Software is furnished to do so, subject to
 the following conditions:

 The above copyright notice and this permission notice shall be
 included in all copies or substantial portions of the Software.

 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
***********************************************************************/

package edu.uconn.vstlf.realtime;
import java.util.Date;

import edu.uconn.vstlf.data.message.VSTLFMessage;


public class VSTLF4SPoint extends VSTLFObservationPoint {
	public static VSTLFMessage.Type mtype = VSTLFMessage.Type.RT4sPoint; 

	public VSTLF4SPoint() {
		super(mtype);
	}
	public VSTLF4SPoint(Date at, double val) {
		super(mtype, at,val);
	}
	
	public VSTLF4SPoint(VSTLFMessage.Type type, Date at, double val) {
		super(type, at,val);
	}
	
	public String toString() {
		return _at.toString() + " : " + Double.toString(_val);
	}
	public double getValue() {
		return _val;
	}
	public Date getStamp() {
		return _at;
	}
}
