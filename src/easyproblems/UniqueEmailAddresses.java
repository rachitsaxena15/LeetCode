package easyproblems;

import java.util.AbstractSet;
import java.util.HashSet;

public class UniqueEmailAddresses {

	public int numUniqueEmails(String[] emails) {
		AbstractSet<String> emailset = new HashSet<>();
		for (String email : emails) {
			String username = email.split("\\@")[0];
			String domain = email.split("\\@")[1];
			if(username.indexOf("+") > -1) {
				username = username.split("\\+")[0];
			}
			if(username.indexOf(".") > -1) {
				String temp[] = username.split("\\.");
				username = "";
				for(int i=0; i<temp.length; i++) {
					username = username+temp[i]; 
				}
			}
			emailset.add(username+"@"+domain);
		}
		return emailset.size();
	}
	
	public static void main(String[] args) {
		UniqueEmailAddresses un = new UniqueEmailAddresses();
		String emails[] = {"fg.r.u.uzj+o.pw@kziczvh.com",
				"r.cyo.g+d.h+b.ja@tgsg.z.com",
				"fg.r.u.uzj+o.f.d@kziczvh.com",
				"r.cyo.g+ng.r.iq@tgsg.z.com",
				"fg.r.u.uzj+lp.k@kziczvh.com",
				"r.cyo.g+n.h.e+n.g@tgsg.z.com",
				"fg.r.u.uzj+k+p.j@kziczvh.com",
				"fg.r.u.uzj+w.y+b@kziczvh.com",
				"r.cyo.g+x+d.c+f.t@tgsg.z.com",
				"r.cyo.g+x+t.y.l.i@tgsg.z.com",
				"r.cyo.g+brxxi@tgsg.z.com",
				"r.cyo.g+z+dr.k.u@tgsg.z.com",
				"r.cyo.g+d+l.c.n+g@tgsg.z.com",
				"fg.r.u.uzj+vq.o@kziczvh.com",
				"fg.r.u.uzj+uzq@kziczvh.com",
				"fg.r.u.uzj+mvz@kziczvh.com",
				"fg.r.u.uzj+taj@kziczvh.com",
				"fg.r.u.uzj+fek@kziczvh.com"};
		/*String emails1[] = {"test.email+alex@leetcode.com",
				"test.e.mail+bob.cathy@leetcode.com",
				"testemail+david@lee.tcode.com"};*/
		
		un.numUniqueEmails(emails);
	}

}
