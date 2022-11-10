//Teh logic behind the code is that we create a stack and put the char into the stack if it is a opening bracket.
//when the current index element is a closing bracket then we have to pop the stack element and check if the popped char is correct opening bracket match for the 
//current found closing bracket if not then simply return false
public boolean isValid(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for (char e : s.toCharArray()) {
            if (e == '{' || e == '[' || e == '(') {
                stack.push(e);
                continue;
            }
            if (e == '}' || e == ']' || e == ')')
                if (stack.isEmpty())
                    return false;
            char a;
            switch (e) {
                case '}' : a = stack.pop();
                           if (a != '{') return false;
                           break;
                case ']' : a = stack.pop();
                            if (a != '[') return false;
                            break;
                case ')' : a = stack.pop();
                           if (a != '(') return false;
                           break;
            }
        }
        return stack.isEmpty();
    }
