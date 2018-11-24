% OPERATORS DEFINITION

% Parallel operator
:- op(550, yfx, "par").

/* This function converts the sequence of parallel operator into list.
   par2list(+sequence of parallel operator,-process parallel's list).*/
par2list(par(H, par(HH)),[H,HH]).
par2list(par(H, par(HH,T)),[H|T1]):-
	par2list(par(HH,T),T1).

/* This function converts the process's sequence into parallel operator's sequence.
   list2par(+process parallel's list, -sequence of parallel operator).*/
list2par([H,HH], par(H, par(HH))).
list2par([H|T1], par(H, par(HH,T))):-
 list2par(T1, par(HH,T)).

/* regalo a cazzo di cane*/
rule(IS, EV, FS) :-
	par2list(IS, L),
	member([X|PP], L),
	EV=X,
	delete([X|PP], L, NL),
 	list2par(NL, PPS),
 	FS = par(PP, PPS).


%par2list(par([a], par([e])), L), member([X | P1], L).
