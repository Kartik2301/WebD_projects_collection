#include <bits/stdc++.h> 
#define MAX_CHAR 26 
using namespace std; 

// A Suffix Trie (A Trie of all suffixes) Node 
class SuffixTrieNode 
{ 
public: 
	SuffixTrieNode *children[MAX_CHAR]; 
	SuffixTrieNode() // Constructor 
	{ 
		// Initialize all child pointers as NULL 
		for (int i = 0; i < MAX_CHAR; i++) 
		children[i] = NULL; 
	} 

	// A recursive function to insert a suffix of the s 
	// in subtree rooted with this node 
	void insertSuffix(string suffix); 
}; 

// A Trie of all suffixes 
class SuffixTrie 
{ 
	SuffixTrieNode *root; 
	int _countNodesInTrie(SuffixTrieNode *); 
public: 
	// Constructor (Builds a trie of suffies of the given text) 
	SuffixTrie(string s) 
	{ 
		root = new SuffixTrieNode(); 

		// Consider all suffixes of given string and insert 
		// them into the Suffix Trie using recursive function 
		// insertSuffix() in SuffixTrieNode class 
		for (int i = 0; i < s.length(); i++) 
			root->insertSuffix(s.substr(i)); 
	} 

	// method to count total nodes in suffix trie 
	int countNodesInTrie() { return _countNodesInTrie(root); } 
}; 

// A recursive function to insert a suffix of the s in 
// subtree rooted with this node 
void SuffixTrieNode::insertSuffix(string s) { 
	if (s.length() > 0) { 
 
		char cIndex = s.at(0) - 'a'; 

		if (children[cIndex] == NULL) 
			children[cIndex] = new SuffixTrieNode(); 
		children[cIndex]->insertSuffix(s.substr(1)); 
	} 
} 

int SuffixTrie::_countNodesInTrie(SuffixTrieNode* node) { 
	if (node == NULL) 
		return 0; 

	int count = 0; 
	for (int i = 0; i < MAX_CHAR; i++) { 
		if (node->children[i] != NULL) 
			count += _countNodesInTrie(node->children[i]); 
	} 
	return (1 + count); 
} 

int countDistinctSubstring(string str) { 
	SuffixTrie sTrie(str); 
	return sTrie.countNodesInTrie(); 
} 

// Driver program to test above function 
int main() 
{ 
	string str = "ababa"; 
	cout << "Count of distinct substrings is "
		<< countDistinctSubstring(str); 
	return 0; 
} 
