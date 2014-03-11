<%@ taglib prefix="s" uri="/struts-tags"%>
<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="4"><s:text
				name="RcPiecesjointesFB.ModificationPiecesjointes" /></th>
	</tr>
	<tr>
		<th><s:text name="RcPiecesjointesFB.TNUM_RCCODEPIECEJOINTE_OB" /></th>
		<td><s:textfield name="TNUM_RCCODEPIECEJOINTE_OB" readonly="true"
				id="TNUM_RCCODEPIECEJOINTE_OB" maxlength="1" cssClass="input200" /></td>
	
		<th><s:text name="RcPiecesjointesFB.TNUM_LIST_RCNATUREPIECEJOINTE" /></th>
		<td><s:textfield name="TNUM_LIST_RCNATUREPIECEJOINTE" 
				id="TNUM_LIST_RCNATUREPIECEJOINTE" maxlength="1" cssClass="input500" /></td>
	</tr>
	
	<tr>
		<th><s:text name="RcPiecesjointesFB.DAT_RCDATEPIECEJOINTE_OB" /></th>
		<td><s:textfield name="DAT_RCDATEPIECEJOINTE_OB" 
				id="DAT_RCDATEPIECEJOINTE_OB" maxlength="10" cssClass="input200" /></td>
		<th><s:text name="RcPiecesjointesFB.TNUM_RCDESPIECEJOINTE_OB" /></th>
		<td><s:textfield name="TNUM_RCDESPIECEJOINTE_OB" 
				id="TNUM_RCDESPIECEJOINTE_OB" maxlength="200" cssClass="input500" /></td>		
				
	</tr>
</table>
<input type="hidden" name="hidden" />


