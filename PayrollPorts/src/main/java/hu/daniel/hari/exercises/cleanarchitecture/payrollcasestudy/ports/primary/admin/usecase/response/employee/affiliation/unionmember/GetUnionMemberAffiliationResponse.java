package hu.daniel.hari.exercises.cleanarchitecture.payrollcasestudy.ports.primary.admin.usecase.response.employee.affiliation.unionmember;

import hu.daniel.hari.exercises.cleanarchitecture.payrollcasestudy.ports.primary.admin.usecase.response.Response;

public class GetUnionMemberAffiliationResponse implements Response {
	public int employeeId;
	public int unionMemberId;
	public int weeklyDueAmount;
}
