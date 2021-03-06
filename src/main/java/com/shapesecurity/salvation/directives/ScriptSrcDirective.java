package com.shapesecurity.salvation.directives;

import com.shapesecurity.salvation.directiveValues.SourceExpression;

import javax.annotation.Nonnull;
import java.util.Set;

public class ScriptSrcDirective extends FetchDirective {
	@Nonnull
	private static final String NAME = "script-src";

	public ScriptSrcDirective(@Nonnull Set<SourceExpression> sourceExpressions) {
		super(ScriptSrcDirective.NAME, sourceExpressions);
	}

	@Nonnull
	@Override
	public Directive<SourceExpression> construct(Set<SourceExpression> newValues) {
		return new ScriptSrcDirective(newValues);
	}
}
